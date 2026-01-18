from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.options import Options
import time
import sys

# --- Configuration ---
# Set up Chrome options.
# 'Headless' mode is recommended for Jenkins (runs without opening a visible UI window).
chrome_options = Options()
# chrome_options.add_argument("--headless") # Uncomment this line if running on a server without screen

# Initialize the Chrome Driver
driver = webdriver.Chrome(options=chrome_options)

try:
    # --- Step 1: Navigate to the Application ---
    # We use localhost because Jenkins runs on the same machine as Tomcat
    print("Step 1: Opening website...")
    url = "http://localhost:8080/Shirel_Miryam_Project/index.jsp"
    driver.get(url)

    # Wait for the page to load completely
    time.sleep(2)

    # --- Step 2: User Interaction (Simulating User) ---
    print("Step 2: Typing username 'Hello DevOps'...")
    # Find the input field by ID and type text
    driver.find_element(By.ID, "username").send_keys("Hello DevOps")

    print("Step 3: Clicking the submit button...")
    # Find the button by CSS Selector and click it
    driver.find_element(By.CSS_SELECTOR, "button").click()

    # Wait for the server to process and reload the page
    time.sleep(2)

    # --- Step 3: Validations (The 4 Asserts) ---
    print("Step 4: Running validations...")

    # Validation 1: Verify Page Title
    expected_title = "DevOps Final Project"
    assert driver.title == expected_title, f"Title mismatch! Expected: {expected_title}, Got: {driver.title}"
    print("  [V] Validation 1 Passed: Page title is correct.")

    # Validation 2: Verify Greeting Text (Logic Check)
    expected_text = "Hello, Hello DevOps!"
    body_text = driver.find_element(By.CSS_SELECTOR, "h2").text
    assert expected_text in body_text, f"Text mismatch! Expected to find '{expected_text}' inside '{body_text}'"
    print("  [V] Validation 2 Passed: Greeting text displayed correctly.")

    # Validation 3: Verify Button Existence
    buttons = driver.find_elements(By.CSS_SELECTOR, "button")
    assert len(buttons) > 0, "Button element not found on the page!"
    print("  [V] Validation 3 Passed: Submit button exists.")

    # Validation 4: Verify Footer Link
    link_text = driver.find_element(By.LINK_TEXT, "Go to HIT Website").text
    assert "Go to HIT Website" == link_text, "HIT Link text mismatch or not found!"
    print("  [V] Validation 4 Passed: HIT website link exists.")

    # --- Conclusion ---
    print("\nSUCCESS: All UI tests passed successfully!")
    sys.exit(0) # Exit code 0 tells Jenkins the build succeeded (Green)

except AssertionError as e:
    # This block catches validation failures (e.g., wrong text)
    print(f"\nFAILURE: Assertion failed. Details: {e}")
    sys.exit(1) # Exit code 1 tells Jenkins the build failed (Red)

except Exception as e:
    # This block catches general errors (e.g., server down, element not found)
    print(f"\nCRITICAL ERROR: An unexpected error occurred. Details: {e}")
    sys.exit(1)

finally:
    # Always close the browser to prevent memory leaks
    print("Closing browser...")
    driver.quit()
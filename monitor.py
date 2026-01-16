import urllib.request
import sys

# --- Configuration ---
# TODO: Update this URL to your current Ngrok address!
URL_TO_CHECK = "https://karol-ununitable-degenerately.ngrok-free.dev/Shirel_Miryam_Project/index.jsp"

def check_site():
    """
    Checks if the website is reachable and returns a 200 OK status.
    Exits with code 0 if successful, 1 if failed (for Jenkins).
    """
    print(f"Starting availability check for: {URL_TO_CHECK} ...")

    try:
        # Sending a GET request to the website
        response = urllib.request.urlopen(URL_TO_CHECK)
        status_code = response.getcode()

        # Check if the status code is 200 (OK)
        if status_code == 200:
            print("SUCCESS: Site is UP and running! (Status 200)")
            sys.exit(0) # Exit with 0 indicates Success to Jenkins
        else:
            print(f"FAILURE: Site returned status code {status_code}")
            sys.exit(1) # Exit with 1 indicates Failure to Jenkins

    except Exception as e:
        # Handle connection errors (e.g., server down, wrong URL)
        print(f"CRITICAL FAILURE: Could not connect to site.")
        print(f"Error details: {e}")
        sys.exit(1)

if __name__ == "__main__":
    check_site()
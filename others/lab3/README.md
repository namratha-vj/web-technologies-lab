#### In this code, the validateForm() function is called when the form is submitted. It retrieves the values of the firstName, password, email, and mobileNumber fields and validates them using regular expressions and conditional statements

The regular expressions used to validate the fields are as follows:

- First Name: `/^[a-zA-Z]+$/` (only alphabets are allowed)
- Password: `/.{6,}/` (password must be at least 6 characters long)
- Email: `/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/` (must follow the standard pattern <name@domain.com>)
- Mobile Number: `/^[0-9]{10}$/` (must contain exactly 10 digits)
If any of the fields fail validation, an alert message is displayed and the function returns false, preventing the form from being submitted. If all fields pass validation, the function returns true, allowing the form to be submitted.

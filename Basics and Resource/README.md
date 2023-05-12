# Links to some resources

- [HTML CheatSheet](https://developer.mozilla.org/en-US/docs/Learn/HTML/Cheatsheet)
- [HTML](https://www.w3schools.com/html/default.asp)
- [CSS](https://www.w3schools.com/css/default.asp)
- [JavaScript](https://www.w3schools.com/js/default.asp)
- [Resource Blog](https://shravan-revanna.notion.site/Web-dev-Resource-Shravan-a0f86d6db7c14c43bff8658472f1b0bd)

## HTML Tags

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Page Title</title>
  </head>
  <body>
    <!-- page content goes here -->
  </body>
</html>

```

- `!DOCTYPE html` specifies the version of HTML you are using.
- `html` contains all the HTML code for your webpage.
- `head` contains metadata about the document such as the page title and links to CSS files.
- `title` sets the title of the page that appears in the browser tab.
- `body` contains all the visible content on the webpage.

## Text

```html
<p>Paragraph</p>
<h1>Heading 1</h1>
<h2>Heading 2</h2>
<strong>Bold Text</strong>
<em>Italic Text</em>
<a href="http://example.com">Link</a>

```

- `p` creates a paragraph.
- `h1` and `h2` create headings.
- `strong` makes text bold.
- `em` makes text italic.
- `a` creates a hyperlink.

## Images

```html
<img src="image.jpg" alt="Description">

```

- `img` inserts an image.
- `src` specifies the URL of the image file.
- `alt` provides a description of the image for accessibility purposes.

## Lists

```html
<ul>
  <li>Item 1</li>
  <li>Item 2</li>
</ul>

<ol>
  <li>Item 1</li>
  <li>Item 2</li>
</ol>

```

- `ul` creates an unordered list.
- `ol` creates an ordered list.
- `li` creates a list item.

## Forms

```html
<form>
  <label for="username">Username:</label>
  <input type="text" id="username" name="username">

  <label for="password">Password:</label>
  <input type="password" id="password" name="password">

  <input type="submit" value="Submit">
</form>

```

- `form` creates a form.
- `label` creates a label for an input element.
- `input` creates an input field.
- `type` specifies the type of input field (e.g. text, password, submit).
- `id` and `name` are used to identify the input field for JavaScript or server-side scripting.

## Tables

```html
<table>
  <thead>
    <tr>
      <th>Header 1</th>
      <th>Header 2</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Row 1, Column 1</td>
      <td>Row 1, Column 2</td>
    </tr>
    <tr>
      <td>Row 2, Column 1</td>
      <td>Row 2, Column 2</td>
    </tr>
  </tbody>
</table>

```

- `table` creates a table.
- `thead` contains the table header row(s).
- `tbody` contains the table body rows.
- `tr` creates a table row.
- `th` creates a table header cell.
- `td` creates a table data cell.

# An inline style sheet applies style rules to a single element

```html
<!DOCTYPE html>
<html>
<head>
 <title>Inline Style Sheet</title>
</head>
<body>
 <h1 style="color: red; font-size: 36px;">Hello, World!</h1>
 <p style="color: blue;">This is an example of an inline style sheet.</p>
</body>
</html>

```

In the example above, we have applied inline style rules to the `h1` and `p` elements using the `style` attribute. The `style` attribute takes a set of CSS property-value pairs, separated by semicolons.

## Internal Style Sheet

An internal style sheet applies style rules to the entire page or a group of pages within a single HTML file.

```html
<!DOCTYPE html>
<html>
<head>
 <title>Internal Style Sheet</title>
 <style>
  h1 {
   color: red;
   font-size: 36px;
  }
  p {
   color: blue;
  }
 </style>
</head>
<body>
 <h1>Hello, World!</h1>
 <p>This is an example of an internal style sheet.</p>
</body>
</html>

```

In the example above, we have defined the CSS rules within the `style` element within the `head` element. These rules apply to all `h1` and `p` elements within the HTML document.

## External Style Sheet

An external style sheet applies style rules to multiple pages within an HTML site.

```html
<!DOCTYPE html>
<html>
<head>
 <title>External Style Sheet</title>
 <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
 <h1>Hello, World!</h1>
 <p>This is an example of an external style sheet.</p>
</body>
</html>

```

In the example above, we have linked to an external style sheet using the `link` element within the `head` element. The `href` attribute specifies the location of the external style sheet file, which in this case is a file named `style.css`.

Here's an example of how the `style.css` file may look like:

```css
h1 {
 color: red;
 font-size: 36px;
}
p {
 color: blue;
}

```

In the `style.css` file, we have defined the same CSS rules as in the internal style sheet example. These rules will apply to all `h1` and `p` elements on any page that links to the `style.css` file.

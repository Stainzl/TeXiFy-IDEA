# TeXiFy-IDEA
LaTeX support for the IntelliJ Platform by [JetBrains](https://www.jetbrains.com/).

Create the most beautiful LaTeX documents with the user friendliness of the IntelliJ platform.
This plugin adds the tools to make creating LaTeX documents a breeze. We are currently doing our best to develop the plugin.
Feel free to share your ideas and contributions with us.
Please bear in mind that this is just a side project for us.

# Features

## Currently supported

### Run configurations
* Multiple 'compile' (run) configurations.
* Supported compilers: `pdfLaTeX`
* Seperate auxiliary files from output (only supported for `MiKTeX`).

### Editor
* Brace matching for `{}`, `[]`, `\[\]` and `$$`.
* Automatically inserts other half of `{}`, `[]`, `\[\]` and `$$`.
* Most math commands get replaced by their unicode representation using folding.
* Gutter icon to navigate to included files.

### Syntax highlighting
* Braces
* Brackets
* Optional parameters
* Commands
* Commands in inline math mode
* Commands in display math mode
* Comments
* Inline math
* Display math
* Stars

### Other
* Fancy icons for `.tex`, `.sty` and `.cls` files (see [GreanTeaFlavouredIcons](https://github.com/RubenSchellekens/GreenTeaFlavouredIcons)), and LaTeX modules.

## In the works
* Gutter icon to compile the selected file [[gutter-icons](https://github.com/Ruben-Sten/TeXiFy-IDEA/tree/gutter-icons)].
* Document structure view [[structure-view](https://github.com/Ruben-Sten/TeXiFy-IDEA/tree/structure-view)].

## Planned
* Embedded (automatically updating) PDF viewer.
* Autocomplete for default tex commands.
* Autocomplete for custom commands.
* Inspections.
* Bibliography file (`.bib`) support.
* Support for more LaTeX compilers.
* Menu items to insert LaTeX commands/templates for the forgetful.
* Code folding.
* Easter eggs.

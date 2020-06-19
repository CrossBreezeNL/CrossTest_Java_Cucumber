# Release notes

Here you can find the release notes of all Java CrossTest releases up till the release this documentation applies to.

[//]: # (Use the following example to create the release notes for a new release.)
[//]: # ()
[//]: # (## Version X.X <sup>[docs](../X.X/)</sup>)
[//]: # ()
[//]: # (- [ ] x.x.x <sup>xx-xx-xxxx</sup>)
[//]: # (>)
[//]: # (> !!! success "New features")
[//]: # (>     * [ ] Template)
[//]: # (>         * [ ] XML Template)
[//]: # (>             - [X] Some new feature...)
[//]: # (> !!! "Enhanced features")
[//]: # (>     * [ ] Model)
[//]: # (>         - [X] Some enhanced feature...)
[//]: # (> !!! warning "Bug fixes")
[//]: # (>     * [ ] Binding)
[//]: # (>         * [X] Some issue...)

## Version 1.0

- [ ] 1.0.3 <sup>17-06-2020</sup>
> New release
> !!! success "Enhanced features"
>     * [ ] Database steps
>         - [X] Support for boolean datatype on SQL Server
>         - [X] Support for bigint datatype
> !!! warning "Bug fixes"
>     * [ ] Result steps
>         - [X] Only evaluate columns that are in expected results when comparing against a SQL query output

- [ ] 1.0.2 <sup>06-05-2020</sup>
> New release
> !!! success "Enhanced features"
>     * [ ] Database steps
>         - [X] Support for boolean datatype

- [ ] 1.0.1 <sup>05-05-2020</sup>
> New release
> !!! success "New features"
>     * [ ] Configuration
>         * [ ] Database
>             - [X] Configure quote object names so table and column names are enclosed in double quotes to support special characters.
> !!! warning "Bug fixes"
>     * [ ] Configuration
>         * [ ] Database server configuration
>              - [X] Username and password are no longer required, since not needed when using integrated security

- [ ] 1.0.0 <sup>31-03-2020</sup>
> New release
> !!! success "New features"
>     * [ ] Configuration
>         * [ ] General
>             - [X] Set debug from config.
>         * [ ] Database
>             - [X] Configure command timeout (seconds) to prevent queries from running forever.
> !!! warning "Bug fixes"
>     * [ ] Test execution
>         * [ ] Result
>              - [X] Fail when the expected results contain a column that is not found in the actual result.

## Version 0.9
- [ ] 0.9.9 <sup>09-03-2020</sup>
> New release
> !!! success "New features"
>     * [ ] Test execution
>         * [ ] General
>             - [X] Use variables in tables and statements


# Android Countries
This library contains a complete list of countries, their alpha2 and alpha3 codes, international prefix code, flags (48dp), latin names, and local names.

# Usage
To use the _android-logging_ library in your builds, add the following line to your Gradle build script:

`compile 'com.airg.android:countries:+@aar'`

Or download the library from the download link at the top of this page.

# Building
Because of the localized names, javadoc fails to build the javadoc (at least on Windows). The solution is to force Javadoc to use the UTF-8 charset:

## Windows
`set JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8"`

## *nix/Mac
`export JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8"`

# Contributions
Please refer to the [contribution instructions](https://airg.github.io/#contribute).

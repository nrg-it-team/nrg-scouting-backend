# nrg-scouting-backend
A backend that can accept data from https://github.com/nrg-it-team/nrg-scouting

# Downloading and building
I used Eclipse Maven to run this with the spring boot plugin, but should be compatible with other ides with maven
<b>maven install</b> builds a tomcat executable that can be run on default port 8080

# Docs
By default, website is hosted at /data/scouting2023 and runs on port 8080.
by default, h2 console is enabled at /h2-console, passwords for use are in /src/resources/application.properties (as well as other spring boot options)
to change any properties at runtime add <b>-Dkey=value</b> to the JVM arguments, eg, for changing password or changing server port.
Currently the only way to take data out of the database is via h2-console (something will be added later to get data most likely)

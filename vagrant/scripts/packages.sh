# Add postgres repo
wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | \
    sudo apt-key add -

sudo apt-get -y update

sudo apt-get -y install \
  openjdk-7-jre \
  postgresql-9.4 \
  postgresql-contrib-9.4

sudo apt-get -y autoremove

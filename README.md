# Kangaroo

## Vagrant
1. Download and install vagrant.
1. Run `vagrant up`
1. Run `vagrant ssh`
1. You should be in `/vagrant`
1. Run `lein`
  * This will install Clojure
1. Run `lein deps`
1. Switch to the postgres user `sudo su - postgres`
1. Run `/vagrant/scripts/create_database.sh && exit`
1. Run `lein ragtime migrate`


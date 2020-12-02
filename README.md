# apache_solr example

## Install Java

```
sudo apt-get update
sudo apt-get install openjdk-8-jdk
```

## Install Apache Solr

```
# Download the installation tar file
cd /data/
wget http://www.apache.org/dyn/closer.lua/lucene/solr/7.7.0/solr-7.7.0.tgz
 
#Extract the install script
sudo tar xzf solr-7.7.0.tgz solr-7.7.0/bin/install_solr_service.sh --strip-components=2
# Run the install script with the working directory marked as /data/solr
sudo bash ./install_solr_service.sh solr-7.7.0.tgz -d /data/solr
 
 
# Check if the server is up and running
sudo /etc/init.d/solr status
```

## Create Core
Each core represents a instance of application data. For example *ysree* project step logs is one core. To create the core follow the below steps

Create a core data folder under /data/solr/data folder and copy default configuration from installation

```
# login as root
sudo su -
cd /data/solr/data
sudo mkdir /data/solr/data/ysree
sudo cp -R /opt/solr/server/solr/configsets/_default/conf/ ysree/
chmod -R 755 ysree/
chown -R solr:solr ysree/
```

## Register core using web UI
    Open http://10.10.10.1:8983
    Open Core Admin on the left panel
    Select Add Core
    Name: test_logging
    instanceDir: /data/solr/data/ysree
    dataDir: /data/solr/data/ysree/data/
    config: solrconfig.xml
    schema: schema.xml
    
 * Add columns to the core by opening Core selector → test_logging → Schema → Add Field based upon the fields in the Solr Entity *TestInstanceLog.java*
 
 * All set! The core can be used in YSREE Web projects using java jpa library for Apache Solr *SolrConfiguration.java*

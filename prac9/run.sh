#!/bin/bash
#1]  install arp watch
sudo apt-get install arpwatch
echo "done 1"
#2] To watch a specific interface
arpwatch -i eth0
echo "done 2"
#3] notice syslog entries
tail -f /var/log/syslog
echo "done 3"
#4]  check current ARP table
arp -a
echo "done 4" 
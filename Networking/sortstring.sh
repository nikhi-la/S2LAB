#!/bin/bash
read -p "Enter number of elements :" n 
echo "Enter $n elements"
for((i=0;i<n;++i))
do
  read a[i]
done
echo ${a[@]}

sorted=($(printf "%s\n" "${a[@]}"|sort))
echo ${sorted[@]}

./testcases.txt > out
diff out actual
x=$(echo $?)
if (( $x==0 ))
then
	echo "Code success"
else
	echo "Code failure"
	exit 1
fi

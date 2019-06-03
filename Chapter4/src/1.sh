
node_txt=$(kubectl get node|grep -v "NAME")
for i in ${node_txt}
do
    txt_ready=$(echo "${i}"|awk '{print $2}')
    txt_ip=$(echo "${i}"|awk '{print $1}')
    if [ "Ready" in $txt_ready ];then
        for k in ${txt_ip}
        do
            echo "ip为$k 状态为$i 节点故障,请检查!!!!"
        done
    fi
done
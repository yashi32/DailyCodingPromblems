#Iterative Approach

def sum_exist(arr,k):
    check=False
    for i in range(0,len(arr)):
        for j in range(i+1,len(arr)):
            if((arr[i]+arr[j])==k):
                check=True
                return check
            
    return check
sum_exist([10, 15, 3, 7],17)

#Optimized Approach


def sum_exist(arr,k):
    check=False
    d={}
    for i in range(0,len(arr)):
        d[arr[i]] =1
    for i in arr:
        if k-i in arr:
            return True
    return False
sum_exist([10, 15, 3, 7],17)
                
       

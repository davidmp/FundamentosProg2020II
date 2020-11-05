class FibonaciMain {
    resultado=0;

   fibonaciRecur(n){
        if(n<0){return -1;}
        if(n==0 ||n==1){return n;}else{
            return this.fibonaciRecur(n-1)+this.fibonaciRecur(n-2);
        }
    }

    fibonaci(n){
        var val1=0, val2=1;  
        this.resultado=0;     
        if(n<0){this.resultado=-1;} 
        if(n==0 ||n==1){this.resultado=n;}
        else{
             for(var val=1;val<n; val++){
                this.resultado=val1+val2;
                 val1=val2;
                 val2=this.resultado;                
             }
        }
        return this.resultado;
     }

     fibonaciBig(n){
        let val1=0n, val2=1n;  
        this.resultado=0n;     
        if(n<0){this.resultado=-1n;} 
        if(n==0 ||n==1){this.resultado=BigInt(n);}
        else{
             for(var val=1;val<n; val++){
                this.resultado=val1+val2;
                 val1=val2;
                 val2=this.resultado;                
             }
        }
        return this.resultado;
     }     

}

/*var obj=new FibonaciMain();
var dato=prompt("Ingrese el numero", 6);
console.log(obj.fibonaciBig(dato));
document.write(obj.fibonaciBig(dato))*/
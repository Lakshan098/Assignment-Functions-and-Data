object Q3{
    
    class Account(id:String , n:Int , b:Double){
        val nic: String = id
        val accnumber: Int = n
        var balance: Double = b
        
        def transfer (a:Double, that : Account)= {
        this.balance = this.balance-a
        that.balance = that.balance+a
        }

        override def toString() : String = "NIC : " + this.nic + "\n Account Number : " + this.accnumber + "\n Balance : " + this.balance
            
    }
    def main(args:Array[String]){
        
        val x = new Account("9816V",7777,250.50)
        val y = new Account("2334V", 9999,1500.50)
    }
}
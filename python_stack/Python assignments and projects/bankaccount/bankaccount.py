class BankAccount:
    def __init__(self, int_rate=0.01, balance=0): 
     self.int_rate= int_rate
     self.balance= balance
     balance=balance
     int_rate=int_rate
     
    def deposit(self, amount):
        self.balance += amount
        print(f"Deposit of ${amount} successful. New balance: ${self.balance}")
        return self
        
        
    def withdraw(self, amount):
        if amount > 0 and self.balance >= amount:
         self.balance -= amount
         print(f"Withdrawal of ${amount} successful. New balance: ${self.balance}")
        else:
         print("Withdrawal failed: insufficient balance or invalid amount.")
        
    
    def display_account_info(self):
        print(f"Balance: ${self.balance}")
        
    # def yield_interest(self,amount,interest):
    #     if amount > 0 and self.balance >= amount:
    #      interest = amount * self.int_rate  
    #     #  self.balance += interest  
    #     print(f"Yield: {interest}")
        
omar= BankAccount("omar")
majd= BankAccount("Majd")

# omar.deposit(50)
# omar.withdraw(20)
# majd.deposit(1000000)
# majd.withdraw(150000)
# omar.yield_interest(100)
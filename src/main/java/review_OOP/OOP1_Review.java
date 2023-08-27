package review_OOP;

public class OOP1_Review
{

}
/*
    PSB - Payment System Provider
        - online banking, credit cards, e- wallet
        - MERCHANT - PSP
            - Implementing only one structure
            - PBS provide one way report structure
            - They need to deal with all Banks
            - Get service from PBS
            - Less commission from Bank

            Advantage of PSP
            - Easy adaptation on new changes
            - Centralized payment options (refunds, dispute, settlements) and reports
            - Product and service opportunities
                - Pay by link
                - Bonus, rewards, discounts etc
                - Wallet with saved card options


            NO PBS in this picture
   Customer - MERCHANT - Virtual POS - Bank
            - You need to get the POS for each Bank
            - Virtual POS - They provide the API

           Disadvantage
            - Merchant has to implement separate (Buttons, reports, security, wallet, recurring payments)
            - Different report from each bank
            - Recurring payment options
            - If you're new in business, The Bank charge you more fee

           2 Type of different models
            - Tenant Models
                PSP deal for you
                COMMISSION RATE
            Advantage
                - PBS select the payment based on structure
                    - Check service provider
                    - Check lowest commission rate

            Disadvantage
                - Error code mapping
                    - Produce meaningful error message
                RETRY MECHANISM
                    - Check the next lowest commission
                    - Look at commission - PSB check lowest one if lowest one isn't available, try one second cheapest one

            If transaction is successful:
                - Commission Rate Calculation
                - Payment Record

            If transaction is failed:
                - Retry or second bank


            - Hybrid Models
                MERCHANT has already made a deal with Bank and comes to PSP
                MERCHANT can't deal with  all BANK
                PBS can't provide all services that The PBS has

                SERVICE FEE + BANK COMMISSION

            BIGGEST CHALLENGE
             - Merchant Frauds
                    - Identity Swap, Business Model Swap, Bust out
                    - Flower Store turns out drug store
             - Customer Frauds
                    - Lost or Stolen cards, Account takeover

                    HANDLE CUSTOMER FRAUDS
                        - 3D security
                            - Unusual credit card transactions
                            - Spending habits
                            - debit cards   - GOES DIRECTLY 3D security
                            - using credit card with over average amounts


             protected
                why?
                    - Access modifier
                    - Encapsulated
                    - Same package and children can access
                    - Private full encapsulated and protected some other classes access for this class under same package

             private
                - If we don't have any child or subclass we can encapsulate the data with private

             What is localization?
                    -
                       What is enum?
                        - you can do your request from specific place and for instance if you need request from england, you would
                            like to get it english
                        - if you want to request specific bank and want to get certain language
                        Some constant
                        ENG, FR, IT, TR, DE
                        - enum is kind of static block and we call them with class name


              What is static?
                - Belongs to class.
                -
              What is constant? Where belongs to?

              Variable types
                - Local variables - belongs to method
                - instance variable - belongs to object
                - static variable - belongs to class

              Constructor
                - Initialize the object
                - We assign all instance variable assign to constructor
                - It's very close to method structure

                super
                    - We invoke the parent class
                    - always call parent constructor and put the same variable
                    - all variable has to match

                Interface
                    - if both payment model implement same thing
                        auth and auth3D

                       - We don't know who is going to do implementation for me
                       - Whoever implement interface and override the interface
                       - Interface is a contract
                            What is contract is security and can't skip the security
                            If you don't know the implementation, you can decide what model and implement
                        So we switch to Hybrid or Tenant model payment
                            - Credit card and debit card payment is the same but the implementation is different

                Abstract class
                        - Concrete method and abstract methods


 */
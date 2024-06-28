# Api REST 

## Diagrama de Classes
```mermaid
classDiagram
    class User {
        - name: String
        - account: Account
        - features: list[Feature]
        - card: Card
        - news: list[News]
    }
    
    class Account {
        - number: String 
        - agency: String 
        - balance: BigDecimal 
        - limit: BigDecimal 
    }
    
    class Card {
        - number: String 
        - limit: BigDecimal 
    }
    
    class Feature {
        - icon: String 
        - description: String 
    }
    
    class News {
        - icon: String 
        - description: String 
    }

    User "1" *--> "1" Account
    User "1" *--> "1" Card
    User "1" *--> "n" Feature 
    User "1" *--> "n" News 

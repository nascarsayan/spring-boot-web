```mermaid
erDiagram
  CUSTOMER ||--o{ ORDER : places
  ORDER ||--|{ LINE-ITEM : contains
  CUSTOMER }|..|{ DELIVERY-ADDRESS : uses

  CUSTOMER {
    string name
    string custNumber
    string sector
  }
  ORDER {
    int orderNumber
    string deliveryAddress
  }
  LINE-ITEM {
    string productCode
    int quantity
    float pricePerUnit
  }
```

`||` means exactly 1<br/>
`}o` and `o{` means 0 or more<br/>
`}|` and `|{` means 1 or more<br/>

Link to mermaid:

https://mermaid.js.org/syntax/entityRelationshipDiagram.html

###

In the VSCOde extension tab search `bierner.markdown-mermaid` and install for VSCode memaid syntax support

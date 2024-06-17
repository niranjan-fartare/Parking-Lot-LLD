## Parking Lot LLD in Java

## Requirements

- Multiple Floors
- Multiple Entry Gates & Exit Gates
- Multiple types of Vehicles (Parking Spots)
- Operator at every entry and exit
- Ticket generation at every gate
- Operator assigns spots to vehicles
- Parking fees calculated at exit gate
- Different payment modes
- Store operator details
- Store vehicle details

## Classes

- ParkingLot
- ParkingLotStatus
- Floor
- User
- Operator
- Gate
- GateType
- Vehicle
- VehicleType
- Ticket
- Spot
- SpotStatus
- EVSpot
- Meter
- Bill
- BillStatus
- Payment
- PaymentMethod
- PaymentStatus

## Clarifications

- How is fee calculated ? (Fixed Fee, Hourly basis, Increasing fee based on hours)
- How are parking spots allocated ?
- Partial payments supported ?
- Support Electric Vehicle parking spot with charging
- EV Charging Fees

## Design Patterns

- Strategy Design Pattern for Fees Calculation
- Strategy Design Pattern for Spot Assignment
- Adapter Design Pattern for Payment


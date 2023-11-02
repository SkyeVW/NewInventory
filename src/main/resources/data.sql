INSERT INTO WarehouseStock (itemId, currentQuantity, lotNumber, expiryMonth, expiryDay, expiryYear, itemName)
    VALUES(1, 30, 3000, 08, 11, 2024, 'Tomatoes');
INSERT INTO WarehouseStock (itemId, currentQuantity, lotNumber, expiryMonth, expiryDay, expiryYear, itemName)
    VALUES(3, 5, 3001, 03, 31, 2027, 'Frozen Dumplings');
INSERT INTO WarehouseStock (itemId, currentQuantity, lotNumber, expiryMonth, expiryDay, expiryYear, itemName)
    VALUES(4, 150, 3002, 03, 12, 2024, 'Butter');
INSERT INTO WarehouseStock (itemId, currentQuantity, lotNumber, expiryMonth, expiryDay, expiryYear, itemName)
    VALUES(5, 90, 3003, 09, 21, 2026, 'Oil');

INSERT INTO Supplier (supplierId, supplierName) VALUES(10, 'Farm Yao');
--INSERT INTO Supplier (supplierId, supplierName, itemId) VALUES(10, 'Farm Yao', 3);
INSERT INTO Supplier (supplierId, supplierName) VALUES(11, 'Sophia Roman Empire');
--INSERT INTO Supplier (supplierId, supplierName, itemId) VALUES(11, 'Sophia Roman Empire', 5);
INSERT INTO Supplier (supplierId, supplierName) VALUES(12, 'LQ Pink');
INSERT INTO Supplier (supplierId, supplierName) VALUES(13, 'Sasha Mangoes');
--INSERT INTO Supplier (supplierId, supplierName, itemId) VALUES(13, 'Sasha Mangoes', 4);

INSERT INTO OrderInformation (orderId, orderDate, expectedArrivalDate, itemId, orderQuantity, orderConfirmation)
    VALUES (5000, 01022023, 01102023, 5, 200, TRUE);
INSERT INTO OrderInformation (orderId, orderDate, expectedArrivalDate, itemId, orderQuantity, orderConfirmation)
    VALUES (5001, 11022023, 01102024, 1, 70, FALSE);
INSERT INTO OrderInformation (orderId, orderDate, expectedArrivalDate, itemId, orderQuantity, orderConfirmation)
   VALUES (5002, 06272023, 07272023, 3, 150, TRUE);
--INSERT INTO OrderInformation (orderId, supplierName, supplierId, orderDate, expectedArrivalDate, itemId, orderQuantity, orderConfirmation)
--    VALUES (5000, 'Sasha Mangoes', 13, 01022023, 01102023, 5, 200, TRUE);
--INSERT INTO OrderInformation (orderId, supplierName, supplierId, orderDate, expectedArrivalDate, itemId, orderQuantity, orderConfirmation)
--    VALUES (5001, 'Farm Yao', 10, 11022023, 01102024, 1, 70, FALSE);
--INSERT INTO OrderInformation (orderId, supplierName, supplierId, orderDate, expectedArrivalDate, itemId, orderQuantity, orderConfirmation)
--   VALUES (5002, 'LQ Pink', 12, 06272023, 07272023, 3, 150, TRUE);

INSERT INTO Shipment (shipmentId, shipmentMonth, shipmentDay, shipmentYear, shipmentSize, newLotNumber, newItemId,
    newExpiryMonth, newExpiryDay, newExpiryYear, shipmentStatus, cancellationReason) VALUES (1037, 06, 18, 2024, 100, 4037, 1, 06, 18, 2027, TRUE);
INSERT INTO Shipment (shipmentId, shipmentMonth, shipmentDay, shipmentYear, shipmentSize, newLotNumber, newItemId,
    newExpiryMonth, newExpiryDay, newExpiryYear, shipmentStatus, cancellationReason) VALUES (1038, 04, 13, 2024, 65, 4038, 2, 04, 13, 2027, FALSE, 'not enough storage due to lack of sales');

INSERT INTO ExpiringItems (itemId, expiryMonth, expiryDay, expiryYear, lotNumber) VALUES (1, 08, 11, 2024, 3000);
INSERT INTO ExpiringItems (itemId, expiryMonth, expiryDay, expiryYear, lotNumber) VALUES (3, 03, 31, 2027, 3001);
INSERT INTO ExpiringItems (itemId, expiryMonth, expiryDay, expiryYear, lotNumber) VALUES (4, 03, 12, 2024, 3002);
INSERT INTO ExpiringItems (itemId, expiryMonth, expiryDay, expiryYear, lotNumber) VALUES (5, 09, 21, 2026, 3003);

INSERT INTO Restock (restockRequestId, itemId, quantity, storeId) VALUES (6000, 4, 20, 7000);
INSERT INTO Restock (restockRequestId, itemId, quantity, storeId) VALUES (6001, 1, 15, 7001);

INSERT INTO Shipping (shipmentId, storeId, itemId, shippingQuantity, shipmentStatus) VALUES (8000, 7000, 4, 20, TRUE);
INSERT INTO Shipping (shipmentId, storeId, itemId, shippingQuantity, shipmentStatus) VALUES (8001, 7001, 1, 15, FALSE);

INSERT INTO departments (code, name, contactEmail) VALUES ('MIE', 'Mechanical and Industrial Engineering', 'reception@mie.utoronto.ca');
INSERT INTO departments (code, name, contactEmail) VALUES ('ECE', 'Electrical and Computer Engineering', 'eceinquiry@utoronto.ca');
INSERT INTO departments (code, name, contactEmail) VALUES ('MSE', 'Materials Science and Engineering', 'materials.engineering@utoronto.ca');

INSERT INTO students (id, firstName, lastName, email) VALUES (1111, 'Tyrion', 'Lannister', 'tyrion.lannister@mail.univ.ca');
INSERT INTO students (id, firstName, lastName, email) VALUES (2222, 'Cersei', 'Lannister', 'cersei.lannister@mail.univ.ca');
INSERT INTO students (id, firstName, lastName, email) VALUES (3333, 'Jaime', 'Lannister', 'jaime.lannister@mail.univ.ca');
INSERT INTO students (id, firstName, lastName, email) VALUES (4444, 'Daenerys', 'Targaryen', 'jaime.targaryen@mail.univ.ca');
INSERT INTO students (id, firstName, lastName, email) VALUES (5555, 'Jon', 'Snow', 'jon.snow@mail.univ.ca');

INSERT INTO professors (id, firstName, lastName, email, office, salary) VALUES (1122, 'Sansa', 'Stark', 'sansa.stark@univ.ca', 'BA1234', 50000);
INSERT INTO professors (id, firstName, lastName, email, office, salary) VALUES (3344, 'Arya', 'Stark', 'arya.stark@univ.ca', 'MC1234', 70000);
INSERT INTO professors (id, firstName, lastName, email, office, salary) VALUES (5566, 'Jorah', 'Mormont', 'jorah.mormont@univ.ca', 'MY1234', 60000);

INSERT INTO courses (code, name, professorId) VALUES ('GOT123', 'A Game of Thrones', 1122);
INSERT INTO courses (code, name, professorId) VALUES ('GOT456', 'A Clash of Kings', 3344);
INSERT INTO courses (code, name, professorId) VALUES ('GOT789', 'A Storm of Swords', 5566);

INSERT INTO marks(studentId, courseCode, mark) VALUES(1111, 'GOT123', 80);
INSERT INTO marks(studentId, courseCode, mark) VALUES(2222, 'GOT123', 85);
INSERT INTO marks(studentId, courseCode, mark) VALUES(3333, 'GOT456', 90);
INSERT INTO marks(studentId, courseCode, mark) VALUES(4444, 'GOT456', 95);
INSERT INTO marks(studentId, courseCode, mark) VALUES(5555, 'GOT789', 100);
INSERT INTO marks(studentId, courseCode, mark) VALUES(5555, 'GOT123', 80);
INSERT INTO marks(studentId, courseCode, mark) VALUES(5555, 'GOT456', 90);
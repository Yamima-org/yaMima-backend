--products 
DELETE FROM PRODUCT;
DELETE FROM IMAGE;

-- images
INSERT INTO public.image(
	filename, url, extensionimage, idimage, idproduct)
	VALUES ('bolonaise.jpg','/assets/images/bolonaise.jpg','jpg',1,3);

INSERT INTO public.image(
	filename, url, extensionimage, idimage, idproduct)
	VALUES ('koskous.jpg','/assets/images/koskous.jpg','jpg',2,4);
	
INSERT INTO public.image(
	filename, url, extensionimage, idimage, idproduct)
	VALUES ('Zgougou.jpg','/assets/images/zgougou.jpg','jpg',3,5);
	
INSERT INTO public.image(
	filename, url, extensionimage, idimage, idproduct)
	VALUES ('coca.jpg','/assets/images/coca.png','png',4,6);



INSERT INTO public.product(
	ingredients, description, idproduct, price, sizeproduct, statut, idimage, nameproduct, rating, category, mainimageid)
	VALUES ('ing1,ing2','desc',3,20,'L','false',1,'Pate Bolonaise',4,'Plat',2);
INSERT INTO public.product(
	ingredients, description, idproduct, price, sizeproduct, statut, idimage, nameproduct, rating, category, mainimageid)
	VALUES ('Des ingredients','plat qui reflete le gout du peuple tunisien',4,26,'S','true',2,'Couscous',1,'Plat',1);
INSERT INTO public.product(
	ingredients, description, idproduct, price, sizeproduct, statut, idimage, nameproduct, rating, category, mainimageid)
	VALUES ('Zgougou,creme, fruits sec','Dessert unique tunisien',5,4,'S','true',3,'Asida Zgougou',5,'Dessert',3);
	
INSERT INTO public.product(
	description, idproduct, price, sizeproduct, statut, idimage, nameproduct, category, mainimageid)
	VALUES ('Boisson au choix',6,2,'S','true',4,'Coca','Boissons',4);


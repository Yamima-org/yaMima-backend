ALTER TABLE product
    ADD COLUMN rating integer;
	
ALTER TABLE product
    ADD COLUMN category character varying(255) COLLATE pg_catalog."default";
.PHONY: up down logs test build

up:
	docker compose up -d

down:
	docker compose down

logs:
	docker compose logs -f

test:
	cd backend && mvn test

build:
	docker compose build

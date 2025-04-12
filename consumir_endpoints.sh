#!/bin/bash

# === MICRO Parcial ===
BASE_URL="http://localhost:8080/mascotas"

echo "🟢 Creando mascota..."
response=$(curl -s -X POST "$BASE_URL" \
  -H "Content-Type: application/json" \
  -d '{"nombre": "Firulais", "raza": "Labrador"}')

echo "$response"
id=$(echo "$response" | grep -o '"id":[0-9]*' | cut -d: -f2)
echo "🆔 ID de la nueva mascota: $id"
echo -e "\n"

echo "🔍 Listando mascotas..."
curl -s "$BASE_URL"
echo -e "\n"

echo "🔎 Obteniendo mascota con ID=$id..."
curl -s "$BASE_URL/$id"
echo -e "\n"

echo "✏️  Actualizando mascota con ID=$id..."
curl -s -X PUT "$BASE_URL/$id" \
  -H "Content-Type: application/json" \
  -d "{\"id\": $id, \"nombre\": \"Firulais\", \"raza\": \"Golden\"}"
echo -e "\n"

echo "🗑️  Eliminando mascota con ID=$id..."
curl -s -X DELETE "$BASE_URL/$id"
echo -e "\n"

echo "✅ Mascotas actuales:"
curl -s "$BASE_URL"
echo -e "\n"

# === MICRO Taller ===
echo "🎓 Llamando al microservicio del taller en http://localhost:8081/"
curl -s http://localhost:8081/
echo -e "\n"

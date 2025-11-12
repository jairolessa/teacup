    // Dados Simulados
    const sampleResults = [
        {
            id: 1,
            name: "Dra. Ana Paula Silva",
            type: "Profissional",
            specialty: "Psicóloga - Especialista em TEA",
            distance: 2.3,
            address: "Rua das Flores, 123 - Centro",
            phone: "(82) 3333-4444",
            tags: ["ABA", "Cognitivo-Comportamental", "Atende crianças"],
            rating: 4.9,
            reviews: 47
        },
        {
            id: 2,
            name: "Clínica NeuroDesenvolver",
            type: "Clínica",
            specialty: "Centro Multidisciplinar TEA",
            distance: 3.8,
            address: "Av. Principal, 456 - Jaraguá",
            phone: "(82) 3555-6666",
            tags: ["Equipe multidisciplinar", "Terapia ABA", "Fonoaudiologia"],
            rating: 4.8,
            reviews: 89
        },
        {
            id: 3,
            name: "Fono Mariana Costa",
            type: "Profissional",
            specialty: "Fonoaudióloga",
            distance: 1.5,
            address: "Rua do Comércio, 789",
            phone: "(82) 3777-8888",
            tags: ["Linguagem", "Comunicação alternativa", "Atendimento domiciliar"],
            rating: 5.0,
            reviews: 32
        },
        {
            id: 4,
            name: "Centro de Equoterapia Vida Nova",
            type: "Atividade",
            specialty: "Equoterapia para crianças TEA",
            distance: 8.2,
            address: "Sítio Recanto Verde - Zona Rural",
            phone: "(82) 3999-0000",
            tags: ["Equoterapia", "Fins de semana", "A partir de 3 anos"],
            rating: 4.7,
            reviews: 28
        },
        {
            id: 5,
            name: "Dr. Roberto Mendes",
            type: "Profissional",
            specialty: "Terapeuta Ocupacional",
            distance: 4.1,
            address: "Praça da Matriz, 321",
            phone: "(82) 3444-5555",
            tags: ["Integração sensorial", "AVDs", "Brincar terapêutico"],
            rating: 4.9,
            reviews: 56
        },
        {
            id: 6,
            name: "Espaço Musicar",
            type: "Atividade",
            specialty: "Musicoterapia",
            distance: 5.7,
            address: "Rua das Artes, 654",
            phone: "(82) 3666-7777",
            tags: ["Musicoterapia", "Aulas em grupo", "Atende todas as idades"],
            rating: 4.6,
            reviews: 41
        },
        {
            id: 7,
            name: "Instituto Avançar",
            type: "Clínica",
            specialty: "Centro ABA Especializado",
            distance: 6.3,
            address: "Av. dos Estados, 1020",
            phone: "(82) 3888-9999",
            tags: ["ABA intensivo", "Supervisão BCBA", "Atendimento escolar"],
            rating: 4.9,
            reviews: 73
        },
        {
            id: 8,
            name: "Natação Adaptada Água Viva",
            type: "Atividade",
            specialty: "Natação para crianças especiais",
            distance: 3.2,
            address: "Clube Recreativo, 888",
            phone: "(82) 3111-2222",
            tags: ["Natação adaptada", "Professores especializados", "Grupos pequenos"],
            rating: 4.8,
            reviews: 35
        },
        {
            id: 9,
            name: "Psicopedagoga Juliana Ramos",
            type: "Profissional",
            specialty: "Psicopedagoga Clínica",
            distance: 2.8,
            address: "Rua Sete de Setembro, 432",
            phone: "(82) 3222-3333",
            tags: ["Alfabetização", "Dificuldades de aprendizagem", "Consultoria escolar"],
            rating: 4.7,
            reviews: 29
        },
        {
            id: 10,
            name: "Escola Inclusiva Pequenos Passos",
            type: "Escola",
            specialty: "Educação Infantil Inclusiva",
            distance: 4.5,
            address: "Rua da Educação, 567",
            phone: "(82) 3444-5556",
            tags: ["Educação inclusiva", "Mediadores", "Berçário ao Infantil V"],
            rating: 4.9,
            reviews: 94
        },
        {
            id: 11,
            name: "Nutricionista Carla Ferreira",
            type: "Profissional",
            specialty: "Nutrição Comportamental TEA",
            distance: 3.9,
            address: "Consultório Saúde Integrada",
            phone: "(82) 3555-6667",
            tags: ["Seletividade alimentar", "Nutrição infantil", "Atendimento familiar"],
            rating: 4.8,
            reviews: 38
        },
        {
            id: 12,
            name: "Centro de Desenvolvimento Infantil",
            type: "Clínica",
            specialty: "Avaliação e Intervenção TEA",
            distance: 7.1,
            address: "Av. Saúde, 2000",
            phone: "(82) 3777-8889",
            tags: ["Avaliação diagnóstica", "Intervenção precoce", "Orientação parental"],
            rating: 4.9,
            reviews: 67
        }
    ];

    let currentResults = [...sampleResults];
    let userCoords = null;

    // Get user location
    let map; // variável global
let markers = [];

function initMap(lat = -9.6658, lng = -35.7353) { // Padrão: Maceió
  map = L.map('map').setView([lat, lng], 13);

  // Adiciona camada de mapa (OpenStreetMap)
  L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    maxZoom: 18,
    attribution: '&copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a>'
  }).addTo(map);
}

// Função para atualizar os marcadores
function updateMap(results) {
  // Remove marcadores antigos
  markers.forEach(marker => map.removeLayer(marker));
  markers = [];

  results.forEach(result => {
    // Simula coordenadas aleatórias próximas
    const lat = -9.65 + Math.random() * 0.05;
    const lng = -35.75 + Math.random() * 0.05;

    const marker = L.marker([lat, lng]).addTo(map)
      .bindPopup(`
        <strong>${result.name}</strong><br>
        ${result.specialty}<br>
        <small>${result.address}</small>
      `);

    markers.push(marker);
  });
}


    function getUserLocation() {
        const locationBadge = document.getElementById('userLocation');

        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(
                (position) => {
                    userCoords = {
                        lat: position.coords.latitude,
                        lng: position.coords.longitude
                    };
                    locationBadge.innerHTML = '📍 Maceió, AL';
                    renderResults(currentResults);
                },
                (error) => {
                    locationBadge.innerHTML = '📍 Maceió, AL';
                    renderResults(currentResults);
                }
            );
        } else {
            locationBadge.innerHTML = '📍 Maceió, AL';
            renderResults(currentResults);
        }
    }

    // Render results
    function renderResults(results) {
        const grid = document.getElementById('resultsGrid');
        const count = document.getElementById('resultsCount');

        if (results.length === 0) {
            grid.innerHTML = `
                <div class="no-results" style="grid-column: 1/-1;">
                    <h3>Nenhum resultado encontrado</h3>
                    <p>Tente ajustar os filtros ou ampliar a área de busca</p>
                </div>
            `;
            count.textContent = 'Nenhum resultado encontrado';
            return;
        }

        count.textContent = `${results.length} profissionais e serviços encontrados`;

        grid.innerHTML = results.map(result => `
            <div class="result-card" onclick="showDetails(${result.id})">
                <div class="card-header">
                    <div>
                        <h3 class="card-title">${result.name}</h3>
                        <p class="card-specialty">${result.specialty}</p>
                    </div>
                    <span class="card-type">${result.type}</span>
                </div>

                <div class="card-info">
                    <div class="info-item">
                        <span>
                            <svg class="icon" viewBox="0 0 24 24" width="22" height="22" fill="#78a896">
                                <path
                                d="M12 2C8.1 2 5 5.1 5 9c0 5.2 7 13 7 13s7-7.8 7-13c0-3.9-3.1-7-7-7zm0 9.5c-1.4 0-2.5-1.1-2.5-2.5S10.6 6.5 12 6.5s2.5 1.1 2.5 2.5S13.4 11.5 12 11.5z"
                                />
                            </svg>
                        </span>
                        <span>${result.distance} km - ${result.address}</span>
                    </div>

                    <div class="info-item">
                        <span>
                            <svg xmlns="http://www.w3.org/2000/svg" width="22" height="22" viewBox="0 0 24 24" fill="#F8BBD0" aria-labelledby="title desc" role="img">
                            <title id="title">Ícone de telefone</title>
                            <desc id="desc">Um telefone representado em rosa claro, simbolizando comunicação.</desc>
                            <path d="M6.62 10.79a15.05 15.05 0 0 0 6.59 6.59l2.2-2.2a1 1 0 0 1 1.01-.24c1.12.37 2.33.57 3.58.57a1 1 0 0 1 1 1v3.49a1 1 0 0 1-1 1A17.93 17.93 0 0 1 2 5a1 1 0 0 1 1-1h3.5a1 1 0 0 1 1 1c0 1.25.2 2.46.57 3.58a1 1 0 0 1-.25 1.01l-2.2 2.2z"/>
                            </svg></span>
                        <span>${result.phone}</span>

                    </div>
                    <div class="info-item">
                        <span><svg xmlns="http://www.w3.org/2000/svg" width="22" height="22" viewBox="0 0 24 24" role="img" aria-labelledby="title desc">
                            <polygon
                                points="12 2.4 14.9 8.7 21.8 9.6 16.6 14.1 17.9 21 12 17.7 6.1 21 7.4 14.1 2.2 9.6 9.1 8.7"
                                fill="#FFD54A"
                                stroke="#FFD54A"
                                stroke-width="1.6"
                                stroke-linejoin="round"
                                stroke-linecap="round"/>
                            </svg>
                        </span>
                        <span>${result.rating} (${result.reviews} avaliações)</span>
                    </div>
                </div>

                <div class="card-tags">
                    ${result.tags.map(tag => `<span class="tag">${tag}</span>`).join('')}
                </div>

                <div class="card-actions">
                    <button class="action-btn btn-primary" onclick="event.stopPropagation(); contactProvider(${result.id})">
                        Entrar em contato
                    </button>
                    <button class="action-btn btn-secondary" onclick="event.stopPropagation(); showRoute(${result.id})">
                        Ver rota
                    </button>
                </div>
            </div>
        `).join('');
    }

    // Filter functions
    function filterResults() {
        const searchTerm = document.getElementById('searchInput').value.toLowerCase();
        const category = document.getElementById('categoryFilter').value;
        const distance = parseFloat(document.getElementById('distanceFilter').value);
        const activeSpecialty = document.querySelector('.pill.active').dataset.specialty;

        let filtered = sampleResults.filter(result => {
            const matchesSearch = result.name.toLowerCase().includes(searchTerm) ||
                                result.specialty.toLowerCase().includes(searchTerm) ||
                                result.tags.some(tag => tag.toLowerCase().includes(searchTerm));

            const matchesCategory = !category || result.type.toLowerCase() === category;
            const matchesDistance = result.distance <= distance;

            const matchesSpecialty = activeSpecialty === 'todos' ||
                                   result.tags.some(tag =>
                                       tag.toLowerCase().includes(activeSpecialty.replace('-', ' '))
                                   );

            return matchesSearch && matchesCategory && matchesDistance && matchesSpecialty;
        });

        currentResults = filtered;
        renderResults(filtered);
    }

    // Event listeners
    document.getElementById('searchInput').addEventListener('input', filterResults);
    document.getElementById('categoryFilter').addEventListener('change', filterResults);
    document.getElementById('distanceFilter').addEventListener('change', filterResults);

    document.querySelectorAll('.pill').forEach(pill => {
        pill.addEventListener('click', function() {
            document.querySelectorAll('.pill').forEach(p => p.classList.remove('active'));
            this.classList.add('active');
            filterResults();
        });
    });

    // Action functions
    function showDetails(id) {
        const result = sampleResults.find(r => r.id === id);
        alert(`Detalhes de ${result.name}\n\nEm uma versão completa, aqui seria aberto um modal com informações detalhadas, fotos, horários de atendimento, depoimentos e opções de agendamento.`);
    }

    function contactProvider(id) {
        const result = sampleResults.find(r => r.id === id);
        alert(`Entrando em contato com ${result.name}\n\nTelefone: ${result.phone}\n\nEm uma versão completa, você poderia ligar diretamente, enviar WhatsApp ou agendar uma consulta.`);
    }

    function showRoute(id) {
        const result = sampleResults.find(r => r.id === id);
        alert(`Abrindo rota para ${result.name}\n\nEm uma versão completa, isso abriria o Google Maps ou Waze com a rota até o local.`);
    }

    // Initialize
    getUserLocation();
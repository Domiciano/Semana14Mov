ArrayList<Persona> personas = new ArrayList<>();
        Persona alvaro = new Persona(UUID.randomUUID().toString(),
                "111110",
                "Alvaro",
                "Alvarez",
                60,
                1000000,
                "M",
                false
        );
        personas.add(alvaro);

        Persona beto = new Persona(UUID.randomUUID().toString(),
                "211110",
                "Beto",
                "Baraja",
                25,
                1200000,
                "M",
                false
        );
        personas.add(beto);

        Persona carla = new Persona(UUID.randomUUID().toString(),
                "311110",
                "Carla",
                "Cardenas",
                36,
                800000,
                "F",
                false
        );
        personas.add(carla);

        Persona dario = new Persona(UUID.randomUUID().toString(),
                "411110",
                "Dario",
                "Delgado",
                72,
                3000000,
                "M",
                true
        );
        personas.add(dario);

        Persona elena = new Persona(UUID.randomUUID().toString(),
                "511110",
                "Elena",
                "Estupiñán",
                62,
                5000000,
                "F",
                true
        );
        personas.add(elena);

        Persona fernanda = new Persona(UUID.randomUUID().toString(),
                "611110",
                "Fernanda",
                "Fernandez",
                29,
                4200000,
                "F",
                true
        );
        personas.add(fernanda);

        Persona german = new Persona(UUID.randomUUID().toString(),
                "711110",
                "German",
                "García",
                51,
                1600000,
                "M",
                true
        );
        personas.add(german);

        Persona horacio = new Persona(UUID.randomUUID().toString(),
                "811110",
                "Horacio",
                "Henao",
                29,
                4200000,
                "M",
                false
        );
        personas.add(horacio);

        Persona irene = new Persona(UUID.randomUUID().toString(),
                "911110",
                "Irene",
                "Isla",
                19,
                3900000,
                "F",
                false
        );
        personas.add(irene);

        Persona juliana = new Persona(UUID.randomUUID().toString(),
                "021110",
                "Juliana",
                "Jara",
                31,
                800000,
                "F",
                true
        );
        personas.add(juliana);

        Persona kevin = new Persona(UUID.randomUUID().toString(),
                "121110",
                "Kevin",
                "Kaufmann",
                71,
                8200000,
                "M",
                false
        );
        personas.add(kevin);

        Persona lina = new Persona(UUID.randomUUID().toString(),
                "221110",
                "Lina",
                "Lara",
                18,
                800000,
                "F",
                false
        );
        personas.add(lina);

        Persona manuel = new Persona(UUID.randomUUID().toString(),
                "321110",
                "Manuel",
                "Manotas",
                64,
                800000,
                "M",
                true
        );
        personas.add(manuel);

        Persona nadia = new Persona(UUID.randomUUID().toString(),
                "421110",
                "Nadia",
                "Navia",
                52,
                2100000,
                "F",
                false
        );
        personas.add(nadia);

        Persona oscar = new Persona(UUID.randomUUID().toString(),
                "521110",
                "Oscar",
                "Orozco",
                33,
                5200000,
                "M",
                true
        );
        personas.add(oscar);

        for(Persona p : personas){
            FirebaseFirestore.getInstance().collection("personas").document(p.getId()).set(p);
        }

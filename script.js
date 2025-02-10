document.addEventListener("DOMContentLoaded", function () {
    let step = 0;
    let credits = 5;
    const sections = document.querySelectorAll(".cv-section");
    const playButton = document.getElementById("play-button");
    const creditCounter = document.getElementById("credit-counter");
    const jackpot = document.getElementById("jackpot");
    const cvContainer = document.getElementById("cv-sections");
    const rewardContainer = document.getElementById("reward-container");

    const rewards = [
        "🏆 Élaboration et suivi des tableaux de bord et des processus internes → Utilisation avancée des outils bureautiques et logiciels financiers (Excel, ERP, logiciels de gestion comptable).",
        "🏆 Élaboration et suivi du budget de l’entreprise → Élaboration et suivi des budgets (BTS CG/apprenti contrôleur de gestion).",
        "🏆 Mise en place de systèmes de pilotage et de contrôle opérationnels → Capacité à travailler en équipe et à interagir avec différents services (apprenti contrôleur de gestion).",
        "🏆 Contribution à l'amélioration des systèmes d’information de gestion → Connaissance des systèmes d’information de gestion (bachelor finance).",
        "🏆 Développement et gestion de la comptabilité analytique → Maîtrise des principes de comptabilité générale et analytique (BTS CG/apprenti comptable).",
        "🏆 Supervision du suivi du Business Plan et optimisation des performances → Force de proposition pour l’optimisation des performances."
    ];

    function updateCredits() {
        creditCounter.innerHTML = "🪙".repeat(credits);
        if (credits === 0) {
            playButton.disabled = true;
        }
    }

    playButton.addEventListener("click", function () {
        if (credits > 0) {
            if (step < sections.length) {
                sections[step].classList.add("visible");
                step++;
            } else if (step === sections.length) {
                jackpot.style.display = "block";
                setTimeout(() => {
                    jackpot.style.display = "none";
                    cvContainer.style.display = "none";
                    showRewards();
                }, 2000);
                step++;
            }
            credits--;
            updateCredits();
        }
    });

    function showRewards() {
        rewardContainer.style.display = "block";
        rewards.forEach((reward, index) => {
            setTimeout(() => {
                let card = document.createElement("div");
                card.classList.add("reward-card");
                card.innerHTML = reward;
                rewardContainer.appendChild(card);
                setTimeout(() => card.classList.add("visible"), 100);
            }, index * 500);
        });
    }
});

document.addEventListener("DOMContentLoaded", function () {
    let step = 0;
    const sections = document.querySelectorAll(".cv-section");
    const playButton = document.getElementById("play-button");

    playButton.addEventListener("click", function () {
        if (step < sections.length) {
            sections[step].classList.add("visible");
            step++;
        } else {
            // Optionnel : Effet Jackpot après la dernière section
            showJackpot();
        }
    });

    function showJackpot() {
        const jackpot = document.createElement("div");
        jackpot.classList.add("jackpot");
        jackpot.innerHTML = "🎉 JACKPOT ! 🎉";
        document.body.appendChild(jackpot);

        setTimeout(() => {
            jackpot.remove();
        }, 3000);
    }
});

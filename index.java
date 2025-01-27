import React, { useState } from "react";
import { motion } from "framer-motion";
import { Card } from "@/components/ui/card";
import { Button } from "@/components/ui/button";

export default function CasinoCV() {
  const [step, setStep] = useState(0);

  const handlePlay = () => {
    if (step < 3) {
      setStep(step + 1);
    }
  };

  return (
    <div className="min-h-screen bg-gradient-to-b from-black to-red-900 text-white flex flex-col items-center p-6 relative">
      <motion.h1
        initial={{ opacity: 0, y: -50 }}
        animate={{ opacity: 1, y: 0 }}
        transition={{ duration: 0.8 }}
        className="text-4xl font-bold mb-4"
      >
        🎰 Bienvenue au Casino David Sok 🎰
      </motion.h1>
      
      <motion.div whileHover={{ scale: 1.1 }} whileTap={{ scale: 0.9 }}>
        <Button onClick={handlePlay} className="bg-yellow-500 hover:bg-yellow-700 text-black font-bold py-2 px-4 rounded mb-6 shadow-lg animate-pulse">
          🎲 Jouer
        </Button>
      </motion.div>
      
      {step >= 1 && (
        <motion.div className="grid grid-cols-1 md:grid-cols-2 gap-6 mt-6">
          {/* Expériences */}
          <Card className="bg-red-600 text-white p-10 rounded-2xl shadow-2xl text-center hover:shadow-red-500">
            <h2 className="text-3xl font-semibold">♣️ Expériences</h2>
            <div className='bg-black p-4 rounded-lg mt-4'>
              <h3 className='text-xl font-semibold'>Contrôleur de gestion</h3>
              <p className='text-sm opacity-80'>Grand Casino de Lyon (2024-2025)</p>
            </div>
            <div className='bg-black p-4 rounded-lg mt-4'>
              <h3 className='text-xl font-semibold'>Apprenti comptable</h3>
              <p className='text-sm opacity-80'>Grand Casino de Lyon (2022-2024)</p>
            </div>
            <div className='bg-black p-4 rounded-lg mt-4'>
              <h3 className='text-xl font-semibold'>Préparateur de commandes</h3>
              <p className='text-sm opacity-80'>Veepee (2020-2022)</p>
            </div>
          </Card>
          
          {/* Formations */}
          <Card className="bg-black text-white p-10 rounded-2xl shadow-2xl text-center hover:shadow-gray-500">
            <h2 className="text-3xl font-semibold">♥️ Mes Formations</h2>
            <div className='bg-red-600 p-4 rounded-lg mt-4'>
              <h3 className='text-xl font-semibold'>Bachelor Finance</h3>
              <p className='text-sm opacity-80'>INSEEC Lyon (2024-2025)</p>
            </div>
            <div className='bg-red-600 p-4 rounded-lg mt-4'>
              <h3 className='text-xl font-semibold'>BTS Comptabilité/Gestion</h3>
              <p className='text-sm opacity-80'>CIEFA IGS Lyon 9 (2022-2024)</p>
            </div>
            <div className='bg-red-600 p-4 rounded-lg mt-4'>
              <h3 className='text-xl font-semibold'>Licence Droit</h3>
              <p className='text-sm opacity-80'>Université Jean Moulin Lyon 3 (2019-2022)</p>
            </div>
          </Card>
        </motion.div>
      )}
      
      {step >= 2 && (
        <motion.div className="grid grid-cols-1 md:grid-cols-2 gap-6 mt-6">
          {/* Soft Skills */}
          <Card className="bg-black text-white p-10 rounded-2xl shadow-2xl text-center hover:shadow-gray-500">
            <h2 className="text-3xl font-semibold">♦️ Soft Skills</h2>
            <div className='bg-red-600 p-4 rounded-lg mt-4'><p>Capacité d’analyse et synthèse</p></div>
            <div className='bg-red-600 p-4 rounded-lg mt-4'><p>Travail en équipe & Communication efficace</p></div>
            <div className='bg-red-600 p-4 rounded-lg mt-4'><p>Gestion du stress & Adaptabilité</p></div>
            <div className='bg-red-600 p-4 rounded-lg mt-4'><p>Prise de décision & Autonomie</p></div>
          </Card>
          
          {/* Hard Skills */}
          <Card className="bg-red-600 text-white p-10 rounded-2xl shadow-2xl text-center hover:shadow-red-500">
            <h2 className="text-3xl font-semibold">♣️ Hard Skills</h2>
            <div className='bg-black p-4 rounded-lg mt-4'><p>Analyse des coûts et rentabilité</p></div>
            <div className='bg-black p-4 rounded-lg mt-4'><p>Reporting et Tableaux de bord</p></div>
            <div className='bg-black p-4 rounded-lg mt-4'><p>Bureautique (Pack Office)</p></div>
            <div className='bg-black p-4 rounded-lg mt-4'><p>Comptabilité (générale et analytique)</p></div>
          </Card>
        </motion.div>
      )}
    </div>
  );
}

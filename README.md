# 🌸 Stree Rakshak

**Stree Rakshak** is a safety-focused web application that helps women travel from one location to another using the **Google Maps API** while considering the **crime index** of different areas.  
It prioritizes safer routes using **K-Means clustering** on crime data to ensure a secure journey.

---

## 🛠 Tech Stack

**Frontend:**
- HTML, CSS, JavaScript
- EJS (Embedded JavaScript Templates)
- Google Maps JavaScript API

**Backend:**
- Node.js
- Express.js

**Data Processing & ML:**
- Python
- Pandas, NumPy
- Scikit-learn (K-Means Clustering)

---

## 📊 How It Works

1. **Data Collection** – Crime data is stored in `crime.csv` and processed into `data.json`.
2. **Clustering** – Python scripts (`kmeans.py`) apply K-Means to group areas by crime severity.
3. **Route Calculation** – Google Maps API fetches possible routes.
4. **Safety Ranking** – Routes passing through low-crime clusters are prioritized.
5. **Display** – Results are shown on an interactive Google Map interface.

---


## ⚡ Installation & Usage

### 1️⃣ Clone Repository
```bash
git clone https://github.com/yourusername/Stree-Rakshak.git
cd Stree-Rakshak
```
### 2️⃣ Clone Repository
```bash
npm install
```
### 3️⃣ Set Environment Variables
```bash
GOOGLE_MAPS_API_KEY=your_google_maps_api_key
```
### 4️⃣ Run the Application
```bash
node app.js
```
### 5️⃣ Access in Browser
```bash
(http://localhost:3000)
```
## 📈 Future Enhancements
🚨 Real-time crime alerts using live police data APIs

📍 Geo-fencing alerts for high-risk zones

🤖 AI-based route recommendation with weather & crowd data

📲 Mobile app version
## “Empowering women through technology — one safe journey at a time.” 💙




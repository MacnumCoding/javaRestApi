import React from 'react';

function HomePage() {
    return (
        <div>
            <header>
                <div className="logo">
                <h1>Home Screen</h1>
                </div>
                <nav>
                    <ul>
                        <li><a href="/">Home</a></li>
                        <li><a href="/Info">About</a></li>
                        <li><a href="/Services">Services</a></li>
                        <li><a href="/Contact">Contact</a></li>
                    </ul>
                </nav>
            </header>
        </div>
    );
}

export default HomePage;
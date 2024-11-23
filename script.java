.card button:hover {
    background: #e04c2a;
}
@media (max-width: 768px) {
    .card {
        flex: 1 1 calc(50% - 20px); /* 2 kolom pada perangkat tablet */
    }
}
@media (max-width: 480px) {
    .card {
        flex: 1 1 100%; /* 1 kolom pada perangkat kecil */
    }
}
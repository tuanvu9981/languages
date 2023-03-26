import { username, password } from "./secret"

export default {
    port: 8000,
    host: "localhost",
    dbURI: `mongodb+srv://${username}:${password}@todoapp.ejnw2.mongodb.net/myFirstDatabase?retryWrites=true&w=majority`
}
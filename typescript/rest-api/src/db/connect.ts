import mongoose, {ConnectOptions} from "mongoose";
import config from "config";
import log from "../logger";

const connect = () => {
    const dbURI = config.get('dbURI') as string;

    return mongoose
        .connect(dbURI, { useNewUrlParser: true, useUnifiedTopology: true } as ConnectOptions)
        .then(() => {
            log.info("Database connected");
        })
        .catch((err) => {
            log.error(err);
            process.exit(1);
        })
}

export default connect;
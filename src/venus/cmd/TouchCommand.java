package venus.cmd;

import data.Parameter;
import venus.Venus;

/**
 * touch Command Handler
 * <p/>
 * Created by Dawnwords on 2014/5/6.
 */
public class TouchCommand implements Command {
    @Override
    public void processCommand(Venus venus, String[] arg) {
        if (!venus.createFile(arg[0])) {
            System.out.println("Fail to create file " + arg[0]);
        }
    }

    @Override
    public boolean checkArgs(String[] args) {
        return args.length == 1 && args[0].getBytes().length <= Parameter.FILE_NAME_LEN;
    }

    @Override
    public String getArgFormat() {
        return "%filename{<52Bytes}";
    }
}

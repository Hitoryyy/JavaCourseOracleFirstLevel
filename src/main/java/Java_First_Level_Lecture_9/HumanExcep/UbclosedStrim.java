package Java_First_Level_Lecture_9.HumanExcep;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import static java.io.FileDescriptor.in;

public class UbclosedStrim extends FilterInputStream {

    @Override
    public void close() throws IOException {
        // NOP
    }

    protected UbclosedStrim(InputStream in) {
        super(in);
    }
}

import android.util.JsonWriter;
import androidx.test.runner.AndroidJUnit4;
import java.io.StringWriter;
import java.io.Writer;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_spaceship_app_production__637581735 {
   @Test
   public void testCase() throws Exception {
      StringWriter var2 = new StringWriter();
      Object var1 = EasyMock.createMock(Writer.class);
      JsonWriter var3 = new JsonWriter((Writer)var1);
      boolean var4 = true;
      var3.setLenient(var4);
   }
}

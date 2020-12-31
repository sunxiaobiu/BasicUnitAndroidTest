import android.util.JsonWriter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_buisnesscardmaker_557471494 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(JsonWriter.class);
      JsonWriter var3 = ((JsonWriter)var2).name("name");
      String var1 = "android";
      var3.value(var1);
   }
}

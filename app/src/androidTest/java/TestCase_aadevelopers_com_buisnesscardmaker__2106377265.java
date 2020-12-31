import android.util.JsonWriter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_buisnesscardmaker__2106377265 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(JsonWriter.class);
      JsonWriter var4 = ((JsonWriter)var3).name("code");
      long var1 = 1L;
      var4.value(var1);
   }
}

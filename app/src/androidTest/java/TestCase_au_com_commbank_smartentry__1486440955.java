import android.content.ContentValues;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_commbank_smartentry__1486440955 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(ContentValues.class);
      String var1 = "android";
      Object var2 = true;
      ((ContentValues)var3).put(var1, (Short)var2);
   }
}

import android.content.ContentValues;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_mumgo_android__519635183 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ContentValues.class);
      Boolean var2 = ((ContentValues)var1).getAsBoolean("unread");
   }
}

import android.content.ContentResolver;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb__128335735 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ContentResolver.class);
      Object var1 = null;
      ((ContentResolver)var2).applyBatch("com.android.contacts", (ArrayList)var1);
   }
}

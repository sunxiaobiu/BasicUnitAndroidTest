import android.database.CharArrayBuffer;
import android.database.Cursor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_lge_media_lgpocketphoto__169864155 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Cursor.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(CharArrayBuffer.class);
      ((Cursor)var3).copyStringToBuffer(var1, (CharArrayBuffer)var2);
   }
}

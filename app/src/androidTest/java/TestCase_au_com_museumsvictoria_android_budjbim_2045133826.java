import android.database.Cursor;
import android.database.DataSetObserver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_museumsvictoria_android_budjbim_2045133826 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Cursor.class);
      Object var1 = EasyMock.createMock(DataSetObserver.class);
      ((Cursor)var2).registerDataSetObserver((DataSetObserver)var1);
   }
}

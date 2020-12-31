import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_docusign_ink__301249343 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Loader.class);
      AsyncTaskLoader var2 = (AsyncTaskLoader)var1;
      var1 = var2.loadInBackground();
   }
}

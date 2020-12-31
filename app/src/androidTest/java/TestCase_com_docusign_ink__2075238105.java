import android.support.v4.content.Loader;
import android.support.v4.content.Loader.OnLoadCompleteListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_docusign_ink__2075238105 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Loader.class);
      Object var1 = null;
      ((Loader)var2).unregisterListener((OnLoadCompleteListener)var1);
   }
}

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.SubMenuBuilder;
import android.support.v7.view.menu.MenuPresenter.Callback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_helloenglish_test__120126221 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Callback.class);
      Object var1 = EasyMock.createMock(SubMenuBuilder.class);
      ((Callback)var2).onOpenSubMenu((MenuBuilder)var1);
   }
}
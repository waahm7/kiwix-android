/*
 * Kiwix Android
 * Copyright (C) 2018  Kiwix <android.kiwix.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.kiwix.kiwixmobile.zim_manager.fileselect_view;

import org.kiwix.kiwixmobile.Zim;
import org.kiwix.kiwixmobile.base.ViewCallback;

/**
 * Created by EladKeyshawn on 06/04/2017.
 */
public interface ZimFileSelectViewCallback extends ViewCallback {
  void setListViewAdapter(LocalZimAdapter localZimAdapter);

  void showNoFilesMessage();

  void hideNoFilesMessage();

  void requestPermissions(String[] strings, int requestStoragePermission);

  void setRefreshing(boolean b);

  void finishActivity();

  void runOnUiThread(Runnable runnable);

  void updateProgressBar(Zim zim, int progress);
}

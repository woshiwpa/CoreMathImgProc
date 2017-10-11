/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyzapps.imgmatrixproc;

/**
 *
 * @author tonyc
 */
public class ImgMatrixOutput {
    
    static public void printMatrix(double[][] darray)  {
        if (darray == null || darray.length == 0)   {
            System.out.println("[]");
        } else {
            System.out.println("[");
            for (int idx = 0; idx < darray[0].length; idx ++)   {
                for (int idx1 = 0; idx1 < darray.length; idx1 ++)   {
                    System.out.print(darray[idx1][idx] + "\t");
                }
                System.out.print("\n");
            }
            System.out.println("]");
        }
    }
    
    static public void printMatrix(double[][] darray, int nLeft, int nTop, int nWidth, int nHeight)  {
        if (darray == null || darray.length == 0)   {
            System.out.println("[]");
        } else if (nLeft < 0 || nTop < 0 || nWidth < 0 || nHeight < 0
                || nLeft + nWidth > darray.length || nTop + nHeight > darray[0].length)    {
            System.out.println("[Invalid range]");
        } else {
            System.out.println("[");
            for (int idx1 = nTop; idx1 < nTop + nHeight; idx1 ++)   {
                for (int idx = nLeft; idx < nLeft + nWidth; idx ++)   {
                    System.out.print(darray[idx][idx1] + "\t");
                }
                System.out.print("\n");
            }
            System.out.println("]");
        }
    }

    static public void printMatrix(long[][] lnarray)  {
        if (lnarray == null || lnarray.length == 0)   {
            System.out.println("[]");
        } else {
            System.out.println("[");
            for (int idx = 0; idx < lnarray[0].length; idx ++)   {
                for (int idx1 = 0; idx1 < lnarray.length; idx1 ++)   {
                    System.out.print(lnarray[idx1][idx] + "\t");
                }
                System.out.print("\n");
            }
            System.out.println("]");
        }
    }
    
    static public void printMatrix(long[][] lnarray, int nLeft, int nTop, int nWidth, int nHeight)  {
        if (lnarray == null || lnarray.length == 0)   {
            System.out.println("[]");
        } else if (nLeft < 0 || nTop < 0 || nWidth < 0 || nHeight < 0
                || nLeft + nWidth > lnarray.length || nTop + nHeight > lnarray[0].length)    {
            System.out.println("[Invalid range]");
        } else {
            System.out.println("[");
            for (int idx1 = nTop; idx1 < nTop + nHeight; idx1 ++)   {
                for (int idx = nLeft; idx < nLeft + nWidth; idx ++)   {
                    System.out.print(lnarray[idx][idx1] + "\t");
                }
                System.out.print("\n");
            }
            System.out.println("]");
        }
    }

    static public void printMatrix(int[][] narray)  {
        if (narray == null || narray.length == 0)   {
            System.out.println("[]");
        } else {
            System.out.println("[");
            for (int idx = 0; idx < narray[0].length; idx ++)   {
                for (int idx1 = 0; idx1 < narray.length; idx1 ++)   {
                    System.out.print(narray[idx1][idx] + "\t");
                }
                System.out.print("\n");
            }
            System.out.println("]");
        }
    }
    
    static public void printMatrix(int[][] narray, int nLeft, int nTop, int nWidth, int nHeight)  {
        if (narray == null || narray.length == 0)   {
            System.out.println("[]");
        } else if (nLeft < 0 || nTop < 0 || nWidth < 0 || nHeight < 0
                || nLeft + nWidth > narray.length || nTop + nHeight > narray[0].length)    {
            System.out.println("[Invalid range]");
        } else {
            System.out.println("[");
            for (int idx1 = nTop; idx1 < nTop + nHeight; idx1 ++)   {
                for (int idx = nLeft; idx < nLeft + nWidth; idx ++)   {
                    System.out.print(narray[idx][idx1] + "\t");
                }
                System.out.print("\n");
            }
            System.out.println("]");
        }
    }

    static public void printMatrix(byte[][] barray)  {
        if (barray == null || barray.length == 0)   {
            System.out.println("[]");
        } else {
            System.out.println("[");
            for (int idx = 0; idx < barray[0].length; idx ++)   {
                for (int idx1 = 0; idx1 < barray.length; idx1 ++)   {
                    System.out.print(barray[idx1][idx] + "\t");
                }
                System.out.print("\n");
            }
            System.out.println("]");
        }
    }

    static public void printMatrix(byte[][] barray, int nLeft, int nTop, int nWidth, int nHeight)  {
        if (barray == null || barray.length == 0)   {
            System.out.println("[]");
        } else if (nLeft < 0 || nTop < 0 || nWidth < 0 || nHeight < 0
                || nLeft + nWidth > barray.length || nTop + nHeight > barray[0].length)    {
            System.out.println("[Invalid range]");
        } else {
            System.out.println("[");
            for (int idx1 = nTop; idx1 < nTop + nHeight; idx1 ++)   {
                for (int idx = nLeft; idx < nLeft + nWidth; idx ++)   {
                    System.out.print(barray[idx][idx1] + "\t");
                }
                System.out.print("\n");
            }
            System.out.println("]");
        }
    }        
}
